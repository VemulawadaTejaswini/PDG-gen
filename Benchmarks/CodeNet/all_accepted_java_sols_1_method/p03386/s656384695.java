import java.util.*;
import java.io.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        
         int a=0;
        int b=0;
        int k=0;
        
         try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                a = Integer.parseInt(tokens[0]);
                b = Integer.parseInt(tokens[1]);
                k = Integer.parseInt(tokens[2]);
            
            }
        }          
                
                
            int start1 = a+k-1;
            int start2 = b-k+1;
            
            if(start1>b){
                start1=b;
            }
            
            if(start2<a){
                start2=a;
            }

            
            List<Integer> list1 = IntStream.rangeClosed(a, start1).mapToObj(Integer::valueOf).collect(Collectors.toList());
            List<Integer> list2 = IntStream.rangeClosed(start2, b).mapToObj(Integer::valueOf).collect(Collectors.toList());
            
            
            

    		List<Integer> newList = new ArrayList<Integer>();
		    newList.addAll(list1);
		    newList.addAll(list2);
        
        
            newList = newList.stream().distinct().collect(Collectors.toList());
        
            Collections.sort(newList);
            newList.forEach(s -> {
            System.out.println(s);
            });


    }
}