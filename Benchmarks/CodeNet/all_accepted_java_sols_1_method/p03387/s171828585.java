import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
      	long B = sc.nextLong();
      	long C = sc.nextLong();
      	long max = Math.max(Math.max(A,B),Math.max(B,C));
      	long count = 0;
		long Ab = A%2;
      	long Bb = B%2;
      	long Cb = C%2;
      	boolean all=false;
      	if(Ab==Bb&&Bb==Cb){
        	all=true;
        }
      	if(all){
        	for(;A<max;A+=2){
            	count++;
            }
          	for(;B<max;B+=2){
            	count++;
            }
          	for(;C<max;C+=2){
            	count++;
            }
          	System.out.println(count);
        }else{
          if(Ab!=Bb&&Ab!=Cb){
          	B++;
            C++;
            count++;
          }
          if(Ab!=Bb&&Bb!=Cb){
          	A++;
            C++;
            count++;
          }          
          if(Cb!=Bb&&Ab!=Cb){
          	B++;
            A++;
            count++;
          }      
                  	for(;A<max;A+=2){
            	count++;
            }
          	for(;B<max;B+=2){
            	count++;
            }
          	for(;C<max;C+=2){
            	count++;
            }
          	System.out.println(count);
        }
      
 		sc.close();
	}
}
