import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int y=sc.nextInt();
        boolean cd=false;
        for(int z=y/10000;z>=0;z--){
            for(int x=y/5000;x>=0;x--){
                int tmp=(y-(z*10000+x*5000));
                if(tmp%1000==0 && tmp>=0 && (z+x+tmp/1000)==n){
                    System.out.println(z+" "+x+" "+tmp/1000);
                    cd=true;
                    break;
                }
            }
            if(cd){
                break;
            }
        }
        if(!cd){
            System.out.println("-1 -1 -1");
        }
    }
}
