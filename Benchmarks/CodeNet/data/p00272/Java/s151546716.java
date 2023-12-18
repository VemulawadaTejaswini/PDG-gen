
public class Main {
public static void main(String[] args) {


int k;
int []intake = new int[4];
int inatai;
int []atai={3,1,4,2};
int []maisu={10,4,1,5};


for(k=0;k<=4;k++){
switch(atai[k]){

case 1:inatai = 6000*maisu[k];break;
case 2:inatai = 4000*maisu[k];break;
case 3:inatai = 3000*maisu[k];break;
case 4:inatai = 2000*maisu[k];break;

inatai = intake[k];                    

System.out.println(atai[k]); 	
System.out.println(maisu[k]);
System.out.println(intake[k]);
}	
}
}
}