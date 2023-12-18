import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String line = sc.nextLine();
            if(line.equals("0")) System.exit(0);
            int l = line.length();
            int[] num = new int[l];
            int s=0;
            for(int i=0;i<l;i++){
                num[i] = line.charAt(i) - '0';
                s += num[i];
            }
            System.out.println(s);
        }
    }
}
