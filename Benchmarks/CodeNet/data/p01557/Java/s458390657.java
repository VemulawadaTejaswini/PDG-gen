import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;

	public static void main(String[] arg) {
		N = sc.nextInt();
		int[] a = new int[N];
		int[] ord = new int[N];
		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextInt();
			ord[i] = i + 1;
		}
		Ar st = new Ar(a);
		Ar ed = new Ar(ord);
		if (st.equals(ed)) {
			System.out.println(0);
			return;
		}
		HashSet<Ar> forward = new HashSet<Ar>();
		HashSet<Ar> backward = new HashSet<Ar>();
		ArrayList<Ar> curFor = new ArrayList<Ar>();
		ArrayList<Ar> curBac = new ArrayList<Ar>();
		forward.add(st);
		backward.add(ed);
		curFor.add(st);
		curBac.add(ed);
		for (int i = 0;; ++i) {
			ArrayList<Ar> nextFor = new ArrayList<Ar>();
			ArrayList<Ar> nextBac = new ArrayList<Ar>();
			for (Ar ar : curFor) {
				for (int j = 0; j < N; ++j) {
					for (int k = 2; j + k <= N; ++k) {
						rev(ar.a, j, k);
						Ar na = new Ar(ar.a);
						rev(ar.a, j, k);
						if (backward.contains(na)) {
							System.out.println(i * 2 + 1);
							return;
						}
						if (forward.contains(na)) {
							continue;
						}
						forward.add(na);
						nextFor.add(na);
					}
				}
			}
			if (i == 4) {
				System.out.println(10);
				return;
			}
			for (Ar ar : curBac) {
				for (int j = 0; j < N; ++j) {
					for (int k = 2; j + k <= N; ++k) {
						rev(ar.a, j, k);
						Ar na = new Ar(ar.a);
						rev(ar.a, j, k);
						if (forward.contains(na)) {
							System.out.println(i * 2 + 2);
							return;
						}
						if (backward.contains(na)) {
							continue;
						}
						backward.add(na);
						nextBac.add(na);
					}
				}
			}

			curFor = nextFor;
			curBac = nextBac;
		}
	}

	static void rev(int[] a, int s, int l) {
		for (int i = 0; i < l / 2; ++i) {
			int tmp = a[s + i];
			a[s + i] = a[s + l - 1 - i];
			a[s + l - 1 - i] = tmp;
		}
	}

	static class Ar {
		int[] a;

		Ar(int[] ar) {
			this.a = ar.clone();
		}

		public int hashCode() {
			return Arrays.hashCode(a);
		}

		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			Ar other = (Ar) obj;
			return Arrays.equals(a, other.a);
		}
	}

}