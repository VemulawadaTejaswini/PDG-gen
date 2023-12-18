import java.util.Scanner;

public class practice {
	public static void Main(String[] args) {
        new practice().run();
    }
    void run(){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int count=0;
            char name[]=sc.next().toCharArray();
            char old[][]=new char[n][];
            int temp[]=new int[name.length];
            for(int i=0; i<n; i++){
                old[i]=sc.next().toCharArray();
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<old[i].length; j++){
                    if(name[0]==old[i][j]){
                        if(signBord(name, old[i], j, 0, temp)){
                            count++;
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
    boolean signBord(char name[],char old[],int k,int d, int temp[]){
        temp[d]=k;
        if(name.length-1 <= d){
            for(int i=0; i+2<name.length; i++){
                if(temp[i+1]-temp[i] != temp[i+2]-temp[i+1]){
                        return false;
                }
            }
            return true;
        }
        for(int j=k+1; j<old.length; j++){
            if(name[d+1]==old[j]){
                if(signBord(name, old, j, d+1, temp)){
                    return true;
                }
            }
        }
        return false;
    }
}