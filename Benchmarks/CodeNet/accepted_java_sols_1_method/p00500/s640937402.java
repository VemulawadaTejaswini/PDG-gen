import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int card[][]=new int[n][3];
int point[]=new int[n];

for(int j=0;j<n;j++){
	for(int i=0;i<3;i++) card[j][i]=sc.nextInt();
}
for(int i=0;i<3;i++){
    for(int j=0;j<n;j++){
	int flag=0;
        for(int k=0;k<n;k++){	
	    if(card[j][i]==card[k][i])flag++;
	    }
  if(flag==1)point[j]+=card[j][i];
}
}
for(int j=0;j<n;j++)System.out.println(point[j]);
}
}