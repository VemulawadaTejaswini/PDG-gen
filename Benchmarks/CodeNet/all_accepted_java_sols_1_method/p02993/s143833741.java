import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        String s = sc.next();
        char[] code = s.toCharArray();
        String ans = "Good";
        for(int i = 0; i< code.length-1;i++){
            if(code[i]==code[i+1]){
                ans ="Bad";
            }
        }
        //System.out.println((s + s).contains(s2) ? "Yes" : "No");
        System.out.println(ans);

    }
}