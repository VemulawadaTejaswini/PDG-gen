import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        HashSet<Character> hashSet = new HashSet<>();
        for(char c: nums){
            hashSet.add(c);
        }

        String str = scanner.next();

        for(int i=0; i<str.length(); i++){
            if(i != A){
                if(!hashSet.contains(str.charAt(i))){
                    System.out.println("No");
                    return;
                }
            }else{
                if(str.charAt(i) != '-'){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
