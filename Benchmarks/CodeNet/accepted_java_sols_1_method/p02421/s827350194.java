import java.io.*;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String taro, hanako, str;
        int st=0, sh=0;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            str = br.readLine();
            taro = str.substring(0, str.indexOf(' '));
            hanako = str.substring(str.indexOf(' ')+1);
            if(taro.compareTo(hanako) < 0) sh += 3;
            else if(taro.compareTo(hanako) > 0) st+=3;
            else { st++; sh++; }
        }
        System.out.println(st + " " + sh);
    }
}