import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>(3);
        while(sc.hasNext()){
            list.add(Integer.parseInt(sc.next()));
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for(Integer i: list){
            sb.append(i);
            sb.append(" ");
        }
        
        sb.deleteCharAt(sb.length()-1);
        
        System.out.println(sb);

    }

}

