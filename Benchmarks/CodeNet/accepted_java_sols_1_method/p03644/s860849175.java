//this library has many things needed for arrays, the asterisc means we get everything is inside, the dot says where is is inside, you need the ; to tell the line has ended, like in C
import java.util.*;

//the name of the main function has to be the same name of the program
//what public class mean in java: it means that other function scan also access the class. What happens if we dont make it public? Well, it stil works, but it will be visivle to code only in the same package
public class Main {
	//this is a method, it tells that it will execute the things that are inside, it takes string as args when we execute the program, it is optional. What if instead we use int? It does not work, it has to be String[] args
	public static void main(String[] args){
		//it is a class of the .util that is used to take input from the user. Why it is used as class?
		Scanner sc = new Scanner(System.in);
		// get a integer
		//nextInt is a method, it will take text and turn it into an integer. It is looking for space or line break? Yes, if it is a line break or a space it treats it the same way. How to consider it is different?
		int N = sc.nextInt();
       	int A = 0;
      	int base = 2;
		// get two integers separated with half-width break
		for (int i = 0; i <= N; i++){
       		if(Math.pow(base,i)<=N){
            	A = (int)Math.pow(base,i);
            }
          	else{
              break;
            }
            	
        }
		// output
		//prints a new line. It looks like it has to be repeated all the time System.out.println
		//so you can tell println to print an int because it is overloaded, it means it has all the methods and it will find the one that can print what you pass to it, while in c++ you have to tell what you are printing
		System.out.println(A);
	}
}

