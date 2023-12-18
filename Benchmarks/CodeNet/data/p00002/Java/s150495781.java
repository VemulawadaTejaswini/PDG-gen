import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sum_list=new ArrayList<>();
        
        String str=br.readLine();
        while(str.length()!=0){
            StringTokenizer st=new StringTokenizer(str," ");
            int sum=Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            sum_list.add(String.valueOf(sum).length());
            str=br.readLine();
        }for(int i=0;i<sum_list.size();i++){
            System.out.println(sum_list.get(i));
        }
    }
    
}