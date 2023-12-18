
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        final int N=scanner.nextInt();
        final String string=scanner.next();

        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String[] strings=string.split("");
        int max=Integer.MIN_VALUE;
        for(int i=1;i<N;i++){
            boolean[] booleans1=new boolean[alphabet.length()];
            boolean[] booleans2=new boolean[alphabet.length()];
            for(int j=0;j<N;j++){
                if(j<i){
                    booleans1[alphabet.indexOf(strings[j])]=true;
                }else{
                    booleans2[alphabet.indexOf(strings[j])]=true;
                }
            }
            int subMax=0;
            for(int j=0;j<booleans1.length;j++){
                if(booleans1[j]&&booleans2[j]) subMax++;
            }
            if(max<subMax) max=subMax;
        }
        System.out.println(max);
    }
}