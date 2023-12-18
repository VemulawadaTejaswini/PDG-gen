import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				int n[] = new int[13];
				int s1[] = new int[14];
				int s2[] = new int[14];

				for (int i=0;i<13;i++) n[i] = Character.getNumericValue(buf.charAt(i));
				Arrays.sort(n);

				boolean First = true;
				for (int i=1;i<=9;i++) {
					for (int j=0;j<13;j++) {
						s1[j] = n[j];
						s2[j] = n[j];
					}
					s1[13] = i;
					s2[13] = i;
					Arrays.sort(s1);
					if (NotAccept(s1)) continue;
					Arrays.sort(s2);
					for (int j=1;j<=9;j++) {
						if (removeTwo(s1,j)) {
							for (int k=1;k<=9;k++) {
								removeThree(s1,k);
							}
							for (int k=1;k<=7;k++) {
								removeStraight(s1,k);
								removeStraight(s1,k);
							}
							//System.out.println("i = "+i);
							//for (int k=0;k<14;k++) System.out.print(s1[k]);
							//System.out.print(" ");
							//for (int k=0;k<14;k++) System.out.print(s2[k]);
							//System.out.println("");
							if (s1[0]==10) {
								if (First) {
									System.out.print(i);
									First = false;
								} else {
									System.out.print(" "+i);
								}
								break;
							} else {
								for (int k=0;k<14;k++) s1[k] = s2[k];
								removeTwo(s1,j);
								for (int k=1;k<=7;k++) {
									removeStraight(s1,k);
									removeStraight(s1,k);
								}
								for (int k=1;k<=9;k++) {
									removeThree(s1,k);
								}
								//System.out.println("reverse i = "+i);
								//for (int k=0;k<14;k++) System.out.print(s1[k]);
								//System.out.print(" ");
								//for (int k=0;k<14;k++) System.out.print(s2[k]);
								//System.out.println("");
								if (s1[0]==10) {
									if (First) {
										System.out.print(i);
										First = false;
									} else {
										System.out.print(" "+i);
									}
									break;
								}
							}
							for (int k=0;k<14;k++) s1[k] = s2[k];
						}
					}
				}
				if (First) System.out.println(0);
				else System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean NotAccept(int s[]) {
		for (int i=1;i<=9;i++) {
			for (int j=0;j<10;j++) {
				if (s[j]==i&&s[j+1]==i&&s[j+2]==i&&
					s[j+3]==i&&s[j+4]==i) return true;
			}
		}
		return false;
	}

	public static boolean removeTwo(int s[],int n) {
		for (int i=0;i<13;i++) {
			if (s[i]==n&&s[i+1]==n) {
				s[i] = s[i+1] = 10;
				Arrays.sort(s);
				return true;
			}
		}
		return false;
	}

	public static boolean removeThree(int s[],int n) {
		for (int i=0;i<12;i++) {
			if (s[i]==n&&s[i+1]==n&&s[i+2]==n) {
				s[i] = s[i+1] = s[i+2] = 10;
				Arrays.sort(s);
				return true;
			}
		}
		return false;
	}

	public static boolean removeStraight(int s[],int n) {
		if (s[0]==n&&s[1]==n+1&&s[2]==n+2) {
			s[0] = s[1] = s[2] = 10;
			Arrays.sort(s);
			return true;
		} else {
			if (s[0]==n&&s[2]==n+1&&s[4]==n+2) {
				s[0] = s[2] = s[4] = 10;
				Arrays.sort(s);
				return true;
			} else if (s[0]==n&&s[1]==n+1&&s[3]==n+2) {
				s[0] = s[1] = s[3] = 10;
				Arrays.sort(s);
				return true;
			} else if (s[0]==n&&s[2]==n+1&&s[3]==n+2) {
				s[0] = s[2] = s[3] = 10;
				Arrays.sort(s);
				return true;
			} else if (s[0]==n&&s[2]==n+1&&s[5]==n+2) {
				s[0] = s[2] = s[5] = 10;
				Arrays.sort(s);
				return true;
			}
		}
		return false;
	}

	/*public static boolean removeStraight(int s[],int n) {
		for (int i=0;i<12;i++) {
			if (s[i]==n&&s[i+1]==n+1&&s[i+2]==n+2) {
				s[i] = s[i+1] = s[i+2] = 10;
				Arrays.sort(s);
				return true;
			} else {
				if (i<10&&s[i]==n&&s[i+2]==n+1&&s[i+4]==n+2) {
					s[i] = s[i+2] = s[i+4] = 10;
					Arrays.sort(s);
					return true;
				} else if (i<11&&s[i]==n&&s[i+1]==n+1&&s[i+3]==n+2) {
					s[i] = s[i+1] = s[i+3] = 10;
					Arrays.sort(s);
					return true;
				} else if (i<11&&s[i]==n&&s[i+2]==n+1&&s[i+3]==n+2) {
					s[i] = s[i+2] = s[i+3] = 10;
					Arrays.sort(s);
					return true;
				}
			}
		}
		return false;
	}*/
}

/*
1122334455667
2233344455678
*/