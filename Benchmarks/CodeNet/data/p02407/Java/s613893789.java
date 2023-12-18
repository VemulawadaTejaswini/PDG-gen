import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   
public static void main(String[] args) {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

try {

int N = Integer.parseInt(br.readLine());

String first[] = br.readLine().split("[\\s]+");
int array[] = new int[first.length];

for(int i = 0; i < first.length; i++){
array[i] = Integer.parseInt(first[i]);
}

for(int j = (first.length)-1; j >= 0; j--){
if(j==0)
System.out.print(array[j]);
System.out.print(array[j]+" ");
}
}

}

}
