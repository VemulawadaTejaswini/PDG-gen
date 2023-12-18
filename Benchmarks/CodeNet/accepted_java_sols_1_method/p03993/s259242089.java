        import java.util.*;
         
        public class Main {
         
        	public static void main(String[] args){
            		Scanner in = new Scanner(System.in);
            		
            		int numbers = in.nextInt();
            		ArrayList<Integer> array = new ArrayList<Integer>();
            		for (int x = 0; x < numbers; x++){
            			array.add(in.nextInt());
            		}
            		
            		int counter = 0;
            		for (int x = 0; x < array.size(); x++){
            			if (x + 1 == array.get(array.get(x)-1)){
            				counter++;
            			}
            		}
            		counter /= 2;
            		System.out.println(counter);
            		in.close();
            }
        }