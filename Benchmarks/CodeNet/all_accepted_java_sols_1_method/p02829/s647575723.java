
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String s=sc.nextLine();

int a=Integer.parseInt(s);
       s=sc.nextLine();
      
int b=Integer.parseInt(s);


int[] data={1,2,3};
for(int i=0;i<3;i++){
if(data[i]==a)data[i]=0;
if(data[i]==b)data[i]=0;

}

for(int i=0;i<3;i++){
if(data[i]!=0)
System.out.println(data[i]);
}



	}
}