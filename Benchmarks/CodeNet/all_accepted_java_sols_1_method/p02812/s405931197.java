import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int found= 0;
        char[] ch= new char[S.length()];
        for(int i=0; i<N-2;i++){
            String check = Character.toString(S.charAt(i));
            if(check.equals("A") ){
                check = Character.toString(S.charAt(i+1));
                if(check.equals("B")){
                    check = Character.toString(S.charAt(i+2));
                    if(check.equals("C")){
                        found++;
                    }
                }
            }
        }
        System.out.println(found);
    }
}