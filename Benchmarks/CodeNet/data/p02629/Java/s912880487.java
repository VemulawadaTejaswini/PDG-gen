import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char alphabet[] = new char[26];

        char c = 'a';

        for(int i = 0; i < 26; i++){
            alphabet[i] = c++;
        }

        long n = sc.nextLong();

        List<Integer> list = new ArrayList<>();

        int k = 0;
        while(true){
            k++;
            long p = n % 26;

            if(p == 0) {
                list.add(26);
                if((n / 26) - 1 == 0){
                    break;
                }
                n = (n / 26) - 1;
            }else{
                list.add((int)p);
                if(n / 26 == 0){
                     break;
                }
                n /= 26;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < k ; j++){
            sb.append(alphabet[list.get(j) - 1]);
        }

        System.out.println(sb.reverse());

    }
}
