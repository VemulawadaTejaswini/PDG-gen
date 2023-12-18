import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int paper[][] = new int[20][20];
    for(int i=0; i<20; i++) {
      for(int j=0; j<20; j++) {
        paper[i][j] = 0;
      }
    }
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String line = sc.nextLine();
      String[] a = line.split(",");
      int x = Integer.parseInt(a[0])+2;
      int y = Integer.parseInt(a[1])+2;
      int s = Integer.parseInt(a[2]);
      if(s == 1) {
        paper[y][x]   += 1;
	paper[y+1][x] += 1;
	paper[y-1][x] += 1;
	paper[y][x+1] += 1;
	paper[y][x-1] += 1;
      }
      else if(s == 2) {
	for(int i=-1;i<=1;i++) {
          for(int j=-1;j<=1;j++) {
            paper[y+i][x+j] += 1;
	  }
	}
      }
      else if(s == 3) {
	for(int i=-1;i<=1;i++) {
          for(int j=-1;j<=1;j++) {
            paper[y+i][x+j] += 1;
	  }
	}
	paper[y+2][x] += 1;
	paper[y-2][x] += 1;
	paper[y][x+2] += 1;
	paper[y][x-2] += 1;
      }
    }
    int count=0;
    int max=0;
    for(int i=2; i<12; i++) {
      for(int j=2; j<12; j++) {
	if(paper[i][j] == 0) {
          count++;
	}
	if(max < paper[i][j]) {
          max = paper[i][j];
	}
      }
    }
    System.out.println(count);
    System.out.println(max);
  }
}