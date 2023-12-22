import java.util.*;

public class Main{
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l[] = new int[n*2];
        for(int i = 0; i < n*2; i++){
            l[i] = scan.nextInt();
        }
        Arrays.sort(l);
        int count = 0;
        for(int i = 0; i < l.length-1;i+=2){
            if(l[i] == l[i+1]){
                count+=l[i];
                continue;
            }else{
                count+=Math.min(l[i],l[i+1]);
            }
        }
        System.out.println(count);
    }
}