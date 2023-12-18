import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
         
        int[] a = new int[10000];
        int[] b = new int[10000];
        while(true){
            String[] tmp = stdIn.nextLine().split(",");
            if(tmp.length!=2){
                break;
            }
            else{
                a[Integer.parseInt(tmp[0])]++;
            }
        }
        while(stdIn.hasNext()){
            String[] tmp = stdIn.nextLine().split(",");
            b[Integer.parseInt(tmp[0])]++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>0&&b[i]>0){
                System.out.println(i+" "+(a[i]+b[i]));
            }
        }
    }
}