import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int k=sc.nextInt();int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        boolean flag=true;int plus=0;int count=0;
        while (flag){
            int first_group = 0; int second_group =0;
            for(int i=0;i<k;i++){
                first_group+=array[i+plus];
            }
            for(int i=0;i<k;i++){
                second_group+=array[i+plus+1];
            }plus++;
            if(second_group-first_group>0) {
                System.out.println("Yes");
                count++;
            }
            else{
                System.out.println("No");
                count++;
            }
            if(count==n-k)
                flag=false;

        }

