import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int[][] array = new int[3][3];
    
    for(int i=0 ; i<3 ; i++){
      for(int h=0 ; h<3 ; h++){
        array[i][h] = sc.nextInt();
      }
    }
    
    int n = sc.nextInt();
    int[] arrayans = new int[n];
    
    for(int i=0 ; i<n ; i++){
      arrayans[i] = sc.nextInt();
    }
    
    for(int i=0 ; i<3 ; i++){
      for(int h=0 ; h<3 ; h++){
        for(int g=0 ; g<n ; g++){
    if(arrayans[g]==array[i][h]){
      array[i][h] = 0;
    }
        }
      }
    }
    
    if((array[0][0]==0)&&(array[1][0]==0)&&(array[2][0]==0)){
      System.out.println("Yes");
      return;
    }else if((array[0][1]==0)&&(array[1][1]==0)&&(array[2][1]==0)){
      System.out.println("Yes");
      return;
    }else if((array[0][2]==0)&&(array[1][2]==0)&&(array[2][2]==0)){
      System.out.println("Yes");
      return;
  	}else if((array[0][0]==0)&&(array[0][1]==0)&&(array[0][2]==0)){
      System.out.println("Yes");
      return;
	}else if((array[1][0]==0)&&(array[1][1]==0)&&(array[1][2]==0)){
      System.out.println("Yes");
      return;
	}else if((array[1][0]==0)&&(array[1][1]==0)&&(array[1][2]==0)){
      System.out.println("Yes");
      return;
	}else if((array[2][0]==0)&&(array[2][1]==0)&&(array[2][2]==0)){
      System.out.println("Yes");
      return;
	}else if((array[0][0]==0)&&(array[1][1]==0)&&(array[2][2]==0)){
      System.out.println("Yes");
      return;
	}else if((array[0][2]==0)&&(array[1][1]==0)&&(array[2][0]==0)){
      System.out.println("Yes");
      return;
	}else{
      System.out.println("No");
      }
    }
}