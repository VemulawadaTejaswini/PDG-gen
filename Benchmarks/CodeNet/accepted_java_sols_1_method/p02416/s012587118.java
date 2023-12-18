import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String a=sc.next();
            if(a.equals("0")){
                break;
            }
            int sum=0;
for(int j=0;j<a.length();j++){
    sum+=a.charAt(j)-'0';
}
System.out.println(sum);
        }
        sc.close();
    }
}
