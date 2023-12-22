
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int Y=scanner.nextInt()/1000;
        int x=-1,y=-1,z=-1;
        for(int i=0;i<=N;i++){
            if(Y-N<9*i){
                break;
            }
            if((Y-N-9*i)%4==0&&N>=(Y-N-9*i)/4+i){
                y=(Y-N-9*i)/4;
                x=i;
                z=N-y-x;
                break;
            }
        }
        System.out.println(x+" "+y+" "+z);

    }
}
