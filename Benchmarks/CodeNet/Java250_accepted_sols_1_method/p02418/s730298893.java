import java.util.*;
class Main {
    public static void main(String...args) {
        boolean isCollect = false;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        String ring = scan.nextLine();
        String str = scan.nextLine();
        char[] chrs = ring.toCharArray();
        List<Character> ringList = new ArrayList<>();
        for(int k = 0 ; k < 2; k++) {
            for(char c :chrs) {
                ringList.add(new Character(c));
            }
        }
        for(int i = 0; i < ring.length(); i++) {
            for(int j = 0; j <str.length(); j++) {
                if(ringList.get(i + j) != str.charAt(j)) {
                    count = 0;
                    for(int k = 0 ; k < 2; k++) {
                        for(char c :chrs) {
                            ringList.add(new Character(c));
                        }
                    }   
                    break;
                }
                else {
                    //Character replace = ringList.get(0);
                    count++;
                    //ringList.add(replace);
                }
            }
            if(count == str.length()) {
                isCollect = true;
            } 
        }
        if(isCollect) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}



