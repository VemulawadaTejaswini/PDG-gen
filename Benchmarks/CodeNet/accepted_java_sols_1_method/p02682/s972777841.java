import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String line=s.nextLine();
        String[] SNum=line.split(" ");
        int[] num=new int[SNum.length];
        for(int i=0;i<SNum.length;i++){
            num[i]=Integer.parseInt(SNum[i]);
        }

        int sum;
        if(num[3]<=num[0]){
            sum=num[3];
        }else if(num[3]<=num[1]){
            sum=num[0];
        }else{
            sum=num[0]-(num[3]-num[0]-num[1]);
        }

        System.out.println(sum);
    }
}