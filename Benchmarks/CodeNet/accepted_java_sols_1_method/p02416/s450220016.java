import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str=sc.nextLine();
            int sum=0;
            for(int i=0;i<str.length();i++){
                String data=String.valueOf(str.charAt(i));
                sum+=Integer.parseInt(data);
            }
            if(sum==0)break;
            else System.out.println(sum);
        }
    } 
}
