import java.util.*

class Main{
 Scanner sc = new Scanner(System.in);
 	public void static main(String[] args{
    	int N = sc.nextInt();
        switch(N%10){
        case 2:case 4:case 7:case 9:
        System.out.println("pon");
        break;
        case 1:case 3:case 5:
        System.out.println("");
        break;
        default:
        System.out.println("");
        break;
        }
     }
}