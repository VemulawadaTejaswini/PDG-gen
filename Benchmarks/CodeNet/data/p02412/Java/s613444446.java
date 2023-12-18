import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line;
        
        while(!"0 0".equals(line = sc.nextLine())){
            String[] str = line.split(" ");
            int n = Integer.parseInt(str[0]);
            int x = Integer.parseInt(str[1]);
            int count = 0;
            if(n>x) n = x-2;
            for(int i = 1;i <= n-2;i++){
                for(int j = i+1;j <= n-1; j++){
                    for(int k = j+1;k<=n;k++){
                        if((i+j+k)==x) count++;
                    }
                }
            }
        System.out.println(count);
        }

    }
}

