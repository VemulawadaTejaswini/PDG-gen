import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s;
        int tmp_A,tmp_Z;
        tmp_A=0;
        tmp_Z=0;
        s=scan.next();
        tmp_A=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                tmp_A=i;
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='Z'){
                tmp_Z=i;
                break;
            }
        }
        System.out.println(tmp_Z-tmp_A+1);
    }
}