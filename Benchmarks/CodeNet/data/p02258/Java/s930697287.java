import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int it = Integer.parseInt(str);
        String[] strarr = new String[it];
        for(int i=0; i < it; i++) {
            strarr[i] = br.readLine();
        }
        
        int max = -1000000001;
        int min = Integer.parseInt(strarr[0]);
        for(int i=1; i < it; i++) {
            max = Math.max(max, Integer.parseInt(strarr[i])-min);
            min = Math.min(min, Integer.parseInt(strarr[i]));
        }
        
        System.out.println(max);
    }
    
}
