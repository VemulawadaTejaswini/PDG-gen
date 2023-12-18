import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        while(sc.hasNext()){
                int r0 = sc.nextInt();
                int w0 = sc.nextInt();
                int c = sc.nextInt();
                int r = sc.nextInt();
                if(r0+w0+c+r == 0)break;
                
                int need = 0;
                for(int i=0;;i++) {
                	if((r0+i*r)/c >= w0) {
                		need = i;
                		break;
                	}
                }
                System.out.println(need);
        }
        }
    }
}

