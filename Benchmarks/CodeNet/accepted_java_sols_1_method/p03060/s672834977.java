import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        ArrayList<Integer> V = new ArrayList<>();
        str = br.readLine();
        for (String s:str.split(" ")){
            V.add(Integer.parseInt(s));
        }
        ArrayList<Integer> C = new ArrayList<>();
        str = br.readLine();
        for (String s:str.split(" ")){
            C.add(Integer.parseInt(s));
        }
        int ans = 0;
        for (int i=0;i<N;i++){
            if (V.get(i)-C.get(i)>0){
                ans += V.get(i)-C.get(i);
            }
        }
        System.out.println(ans);
    }
}