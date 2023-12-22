import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long count = 0;
        String[] data = new String[100011];
        for(int i=0; i<n; i++){
            String s = sc.next();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            data[i] =  new String(c);
        }
        Arrays.sort(data, 0, n);
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                if(!(data[i].equals(data[j]))){
                    long aaa= (long) (j-i-1)*(j-i)/2;
                    count += aaa;
                    i=j-1;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
