import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int x[] = new int[100];
        for(int i = 0 ; i<100 ; i++){
            x[i] = sc.nextInt();
            count += 1;
            if(x[i]==0)
                break;
        }
        for(int i = 0; i < count; i++){
            if(!(i+1==count))
            System.out.println("Case "+i+": "+x[i]);
        else
            break;
        }
    }
}