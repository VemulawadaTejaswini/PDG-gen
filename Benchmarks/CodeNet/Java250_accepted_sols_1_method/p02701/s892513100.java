import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        int x=stdIn.nextInt();
        List<String> list=new ArrayList<String>(){
            {
                for(int i=0; i<x; i++){
                    add(stdIn.next());
                }
            }
        };
       
        Map<String,Integer> map=new HashMap<>();
        for(String s:list){
            Integer i=map.get(s);
            map.put(s,i==null?1:i+1);
        }

        System.out.println(map.size());
        
    }

    

}