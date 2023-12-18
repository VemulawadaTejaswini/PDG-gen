import java.util.Scanner;
public class Main2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        String line=sc.nextLine();
        String answer="";
        int length=line.length();
        for(i=0;i<length;i++){
            char ch =line.charAt(i);
            if(Character.isLowerCase(ch)==true){
                answer+=Character.toUpperCase(ch);
            }else{
                answer+=Character.toLowerCase(ch);
            }
        }
        System.out.println(answer);
    }
}
