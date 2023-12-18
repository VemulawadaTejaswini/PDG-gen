import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(sc.next()));
        }
        
        int count=0;
        int flag=1;
        int i=0;
        
        while(flag==1){
            flag = 0;
            for(int j = n-1; j>=i+1; j--){
                if(list.get(j) < list.get(j-1)){
                    int temp1=list.get(j);
                    int temp2=list.get(j-1);
                    list.set(j,temp2);
                    list.set(j-1,temp1);
                    flag=1;
                    count++;
                }
            }
            i++;
        }
        
        //output
        StringBuilder sb = new StringBuilder();
        for(Integer output:list){
            sb.append(output).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("\n").append(count);
        System.out.println(sb);
    }
}


