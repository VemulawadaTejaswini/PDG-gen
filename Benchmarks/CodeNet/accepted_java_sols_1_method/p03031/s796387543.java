import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int s[][]=new int[M][N];
		int po[]=new int[M];
		for(int i=0;i<M;i++) {
			po[i]=scan.nextInt();
			for(int j=0;j<po[i];j++) {
				s[i][j]=scan.nextInt();
			}
		}
		int p[]=new int[M];
		for(int i=0;i<M;i++) {
			p[i]=scan.nextInt();
		}
		boolean bool[]=new boolean[10];
		int ans=0;
		for(int i1=0;i1<2;i1++) {
			if(i1==0) {
				bool[0]=false;
				}
			else {
				bool[0]=true;
			}
			for(int i2=0;i2<2;i2++) {
				if(i2==0) {
				bool[1]=false;
				}
			else {
				bool[1]=true;
			}
				for(int i3=0;i3<2;i3++) {
					if(i3==0) {
						bool[2]=false;
						}
					else {
						bool[2]=true;
					}
					for(int i4=0;i4<2;i4++) {
						if(i4==0) {
							bool[3]=false;
							}
						else {
							bool[3]=true;
						}
						for(int i5=0;i5<2;i5++) {
							if(i5==0) {
								bool[4]=false;
								}
							else {
								bool[4]=true;
							}
							for(int i6=0;i6<2;i6++) {
								if(i6==0) {
									bool[5]=false;
									}
								else {
									bool[5]=true;
								}
								for(int i7=0;i7<2;i7++) {
									if(i7==0) {
										bool[6]=false;
										}
									else {
										bool[6]=true;
									}
									for(int i8=0;i8<2;i8++) {
										if(i8==0) {
											bool[7]=false;
											}
										else {
											bool[7]=true;
										}
										for(int i9=0;i9<2;i9++) {
											if(i9==0) {
												bool[8]=false;
												}
											else {
												bool[8]=true;
											}
											for(int i10=0;i10<2;i10++) {
												if(i10==0) {
													bool[9]=false;
													}
												else {
													bool[9]=true;
												}
												boolean OK=true;
												for(int j=0;j<M;j++) {
													int co=0;
													for(int k=0;k<po[j];k++) {
														if(bool[s[j][k]-1]) {
															co++;
														}
													}
													if(!(co%2==p[j])) {
														OK=false;
													}
												}
												if(OK) {
													ans++;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		switch(N) {
		case 1:System.out.println(ans/512);break;
		case 2:System.out.println(ans/256);break;
		case 3:System.out.println(ans/128);break;
		case 4:System.out.println(ans/64);break;
		case 5:System.out.println(ans/32);break;
		case 6:System.out.println(ans/16);break;
		case 7:System.out.println(ans/8);break;
		case 8:System.out.println(ans/4);break;
		case 9:System.out.println(ans/2);break;
		case 10:System.out.println(ans);break;
		}
	}
}
