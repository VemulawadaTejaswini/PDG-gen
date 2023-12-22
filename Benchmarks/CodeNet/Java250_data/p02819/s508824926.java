import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int X = s.nextInt();
	Queue<Integer> prime = new ArrayDeque<Integer>();
	List<Integer> list = new ArrayList<Integer>();
	for(int i = 1; i <= 120000; i++){
		prime.add(i);
	}

	while(true){
		if(prime.peek() == 1){
			prime.poll();
			prime.add(1);
		}
		if(prime.peek() == 100003){
			list.add(100003);
			break;
		}
		int count = prime.peek();
		list.add(count);
		while(prime.peek() != 1){
			if(prime.peek()%count == 0){

			}else{
				prime.add(prime.peek());
			}
			prime.poll();
		}
	}
	
	for(int i = 0; i < list.size(); i++){
		if(X <= list.get(i)){
			System.out.println(list.get(i));
			break;
		}
	}

    
  }
}