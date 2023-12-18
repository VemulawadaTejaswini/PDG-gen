import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        
        int max =0;
            for(int j=1; j<N; j++){
                int count = 0;
                String str1 = S.substring(0,j);
                String str2 = S.substring(j,N);
                ArrayList <String> list = new ArrayList<>();
                for(int i=0; i<j; i++){
                    if(str2.contains(str1.substring(i,i+1)) == true && list.contains(str1.substring(i,i+1)) == false){
                        list.add(str1.substring(i,i+1));
                        count++;
                    }
                    if(max<count){
                        max = count;
                    }
                }
        }
        
        System.out.println(max);
        
    }
}
