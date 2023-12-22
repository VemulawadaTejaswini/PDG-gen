import java.util.Scanner;

public class Main {
      public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
int element = scanner.nextInt();

int[] numbers = new int[element];

for(int i=0 ; i<=element-1; i++){
numbers[i] = scanner.nextInt();

}

int count = 0;
boolean isEven =true;

scanner = null;
System.gc();

while(isEven){
for(int i=0 ; i<=element-1; i++){
if(numbers[i]%2 == 0){
	numbers[i] = numbers[i]/2;

}else{
isEven = false;
}

if(i == element-1 && isEven){
count++;
}

}
}
System.out.println(count);

      }
}