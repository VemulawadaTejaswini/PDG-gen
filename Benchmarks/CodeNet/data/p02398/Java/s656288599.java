import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
 
    public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);
    List <Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < 3 ; i++){
    	list.add(scanner.nextInt());
    }
    int count = 0;
    
    for(int i = list.get(0); i < (list.get(list.size()-1)+1); i++){
        if(list.get(list.size()) % i == 0){
        count++;
        }
    }
 
    System.out.println(count);
     
    }
 
 
}