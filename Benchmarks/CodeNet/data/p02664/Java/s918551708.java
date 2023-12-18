import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {

        String T;
        try (Scanner scanner = new Scanner(System.in)) {
            T = scanner.next();
        } catch (Exception e) {
            throw e;
        }

        class State {
            int index;
            char currentChar;
            State previousState;
            int count;
        }

        int score = 0;
        State result = new State(){{
            index = -1;
            currentChar = 0;
            previousState = null;
            count = 0;
        }};
        final ArrayDeque<State> states = new ArrayDeque<>();
        states.push(result);
        while (!states.isEmpty()) {
            final State state = states.pop();

            if (state.index+1 >= T.length()) continue;

            char[] charCandidates;
            if (T.charAt(state.index+1) == '?') {
                charCandidates = new char[]{'P', 'D'};
            } else {
                charCandidates = new char[]{T.charAt(state.index+1)};
            }

            for (char c: charCandidates) {
                State newState = new State(){{
                    index = state.index+1;
                    currentChar = c;
                    previousState = state;
                    count = state.count;
                    if (c == 'D') {
                        count++;
                    }
                    if (index >= 1 && state.currentChar == 'P' && c == 'D') {
                        count++;
                    }
                }};
                if (newState.count >= score && newState.index == T.length()-1) {
                    result = newState;
                    score = newState.count;
                }
                states.push(newState);
            }
        }

        State current = result;
        List<Character> characters = new ArrayList<>();
        while (current.previousState != null) {
            characters.add(current.currentChar);
            current = current.previousState;
        }
        for (int i = characters.size()-1; i >= 0; i--) {
            System.out.write(characters.get(i));
        }
        System.out.println();
    }
}