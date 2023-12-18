import java.util.ArrayList;                                                      
import java.util.Collections;                                                    
import java.util.List;                                                           
import java.util.Scanner;                                                        
                                                                                 
class Main {                                                                     
	public static void main(String[] args) {                                     
		Scanner sc = new Scanner(System.in);                                     
		int N = Integer.parseInt(sc.next());                                     
		int T = Integer.parseInt(sc.next());                                     
                                                                                 
		List<Integer> list = new ArrayList();                                    
		for(int i=0; i<N; i++){                                                  
			int a=Integer.parseInt(sc.next());                                   
			int b=Integer.parseInt(sc.next());                                   
			if(b <= T){                                                          
				list.add(a);                                                     
			}                                                                    
		}                                                                        
		if(list.size() == 0){                                                    
			System.out.println("TLE");                                           
		} else {                                                                 
			Collections.sort(list);                                              
			System.out.println(list.get(0));                                     
		}                                                                        
	}                                                                            
}                                                                                
                                                                                 