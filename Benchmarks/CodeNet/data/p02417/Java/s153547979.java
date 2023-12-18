import java.io.*;

public class Main{
	public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] countor = new int[26];

        try {String Str;
            while((Str = reader.readLine()) != null){
                String str = Str.toLowerCase();
                int n = str.length();
                for(int i = 0; i < n; i++){
                    char c = str.charAt(i);
                    int x = c - 'a';
                    if(x < 0 || 25 < x) continue;
                    countor[x]++;
                }
            }

            char a = 'a';

            for(int i = 0; i < 26; i++){
                char al = a;
                System.out.println(al + " : " + countor[i]);
                a++;
            }
        }catch (IOException e){
            System.out.println(e);
        }

    }
}

