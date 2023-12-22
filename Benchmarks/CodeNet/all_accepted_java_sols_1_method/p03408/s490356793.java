import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n,m,c,yn;
        ArrayList<Integer> list_num = new ArrayList<Integer>();
        String line;
        Map<String,Integer> list = new HashMap<String,Integer>();
        n=sc.nextInt();
        for(int a=0;a<100;a++){
            list_num.add(0);
        }
        for(int a=0;a<n;a++){
            line = sc.next();
            if(list.containsKey(line)){
                int num = list.get(line);
                list_num.set(num,list_num.get(num)+1);
            }
            else{
                int size_num = list.size();
                list.put(line,size_num);
                list_num.set(list.get(line),1);
            }
        }
        m=sc.nextInt();
        for(int a=0;a<m;a++){
            line = sc.next();
            if(list.containsKey(line)){
                int num = list.get(line);
                list_num.set(num,list_num.get(num)-1);
            }
            else{
                int size_num = list.size();
                list.put(line,size_num);
                list_num.set(list.get(line),-1);
            }
        }
        int v = Collections.max(list_num);
        System.out.println(v);
    }
}
