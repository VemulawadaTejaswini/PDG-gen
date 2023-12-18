import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            String row;
            while(!(row = scn.nextLine()).equals(".")) {
                LinkedList<Character> list = new LinkedList<>();
                boolean flg = true;
                try {
                    for(char elm : row.toCharArray()) {
                        if(elm == '(' || elm == '[') {
                            list.push(elm);
                        } else if(elm == ')') {
                            if(!(list.pop() == '(')) {
                                flg = false;
                                break;
                            }
                        } else if(elm == ']') {
                            if(!(list.pop() == '[')) {
                                flg = false;
                                break;
                            }
                        }
                    }
                } catch(NoSuchElementException e) {
                    flg = false;
                }
                System.out.println(flg ? "yes" : "no");
            }
        }
    }
}