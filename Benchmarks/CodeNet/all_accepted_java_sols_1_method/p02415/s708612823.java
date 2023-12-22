import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String a =sc.nextLine();
        String fch;
        String answer="";

        for(int i=0;i<a.length();i++){
            fch=String.valueOf(a.charAt(i));
            if(Character.isUpperCase(a.charAt(i))){
                answer+=fch.toLowerCase();
            }else{
                answer+=fch.toUpperCase();
            }
        }

        System.out.println(answer);

        sc.close();
    }
}
