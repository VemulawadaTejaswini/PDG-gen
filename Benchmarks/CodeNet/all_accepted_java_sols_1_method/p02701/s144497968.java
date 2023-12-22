import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashSet<String> hs = new HashSet();
        while(n--!=0){
            hs.add(br.readLine());
        }
        System.out.println(hs.size());
        

    }
}

//10 3 10 3