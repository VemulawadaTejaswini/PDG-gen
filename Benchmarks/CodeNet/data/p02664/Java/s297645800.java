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
            String current;
            int count;
        }

        final ArrayDeque<State> states = new ArrayDeque<>();
        states.push(new State(){{
            index = -1;
            current = "";
            count = 0;
        }});

        int score = 0;
        String result = "";
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
                    current = state.current+c;
                    count = state.count;
                    if (c == 'D') {
                        count++;
                    }
                    if (index >= 1 && state.current.charAt(index-1) == 'P' && c == 'D') {
                        count++;
                    }
                }};
                if (newState.count >= score && newState.current.length() == T.length()) {
                    result = newState.current;
                    score = newState.count;
                }
                states.push(newState);
            }
        }
        System.out.println(result);
    }
}