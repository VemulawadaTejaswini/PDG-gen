import java.util.Scanner;

public class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


while(true){
int i,j,k;
double sum=0,ave,s=0,sg=0; 


j = sc.nextInt();
int[] intarray = new int[j];

if (j == 0 ){
    break;
}

for(i=0;i<j;i++){

 intarray[i] = sc.nextInt();

sum = sum + intarray[i];
}
ave = sum/j;

for(k=0;k<j;k++){

    s =  s + (intarray[k]-ave)*(intarray[k]-ave);
}



sg = Math.sqrt(s/j);

System.out.println(sg);

}
}
}
