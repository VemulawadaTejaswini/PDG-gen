import java.util.Scanner;
class Main {
  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] i=new int[n];
long sum=0;
long hikui=0;
long takai=0;
for(int x=0;x<n;x++) {
	i[x]=sc.nextInt();
	sum+=i[x];
}

for(int s=0;s<n;s++) {
	if(s ==0) {
		 hikui=i[s];
		 takai=i[s];
	}
	else{
		if(hikui>i[s]) {
		hikui=i[s];
	}
		else if(takai<i[s]) {
			takai=i[s];
		}
	}
}
System.out.println(hikui +" " + takai + " " + sum);
 sc.close();
  }
	  }


